package controller;

import service.CategoryService;
import service.ProductService;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "")
public class ControllerPages {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public String viewHome(ModelMap mm, HttpSession session) {
        mm.put("listCategory", categoryService.getAll());
        mm.put("listProductFeatured", productService.getListFeatured(4));
        mm.put("listProductSale", productService.getListSale(4));
        return "pages/index";
    }

    @RequestMapping(value = "about.html", method = RequestMethod.GET)
    public String viewAbout(ModelMap mm) {
        return "pages/about";
    }

    @RequestMapping(value = "shop.html", method = RequestMethod.GET)
    public String viewShop(ModelMap mm) {
        mm.put("listCategory", categoryService.getAll());
        mm.put("listProduct", productService.getListFeatured(12));
        return "pages/shop";
    }

    @RequestMapping(value = "contact.html", method = RequestMethod.GET)
    public String viewContact(ModelMap mm) {
        return "pages/contact";
    }

    @RequestMapping(value = "category/{categoryUrl}/{categoryId}.html", method = RequestMethod.GET)
    public String viewCategory(ModelMap mm, @PathVariable("categoryUrl") String categoryUrl, @PathVariable("categoryId") long categoryId) {
        mm.put("listCategory", categoryService.getAll());
        mm.put("listProduct", productService.getListByCategory(categoryId));
        return "pages/shop";
    }

    @RequestMapping(value = "product/{productUrl}/{productId}.html", method = RequestMethod.GET)
    public String viewProduct(ModelMap mm, @PathVariable("productUrl") String productUrl, @PathVariable("productId") long productId) {
        mm.put("product", productService.findById(productId));
        return "pages/single";
    }
}
