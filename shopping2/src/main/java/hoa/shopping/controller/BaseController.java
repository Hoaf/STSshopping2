package hoa.shopping.controller;

import hoa.shopping.service.CategoryService;
import hoa.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = {"/","/index"})
	public String index(Model model) {
		model.addAttribute("listPro",productService.findAll());
		model.addAttribute("listCategory",categoryService.findAll());
		return "index";
	}
	@RequestMapping("/detail/{id}")
	public String detail(@PathVariable int id,Model model){
		model.addAttribute("product",productService.findById(id));
		return "detail";
	}
}
