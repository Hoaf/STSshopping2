package hoa.shopping.controller;

import hoa.shopping.CartData;
import hoa.shopping.entities.Product;
import hoa.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<?> addCart(@RequestBody CartData cartData,HttpSession session){
        HashMap<Integer,CartData> cart = (HashMap<Integer,CartData>) session.getAttribute("CART");
        int total = 0;
        if(cart == null){
            cart = new HashMap<>();
        }
        Product product = productService.findById(cartData.getProductId());
        if(product != null){
            if(cart.containsKey(cartData.getProductId())){
                CartData item = cart.get(cartData.getProductId());
                item.setProduct(product);
                item.setQuantity(item.getQuantity() + 1);
                cart.put(cartData.getProductId(),item);
            }else{
                CartData item = new CartData();
                item.setQuantity(1);
                item.setProduct(product);
                cart.put(cartData.getProductId(),item);
            }
            session.setAttribute("CART",cart);
            for(Integer key : cart.keySet()){
                total += cart.get(key).getQuantity();
            }
        }
        return ResponseEntity.ok(total);
    }
}
