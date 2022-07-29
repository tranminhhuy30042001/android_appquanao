package com.quanao.hanghieu.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;


public class Utils {

    Context context;
    public static String username;
    public static String giamgia = "";
    public static List<CartItem> cartItems = new ArrayList<>();
    public static List<ProductItem> productItems = new ArrayList<>();


    public static void addToProduct(Product product){
        ProductItem tmp = new ProductItem();
        tmp.id = product.id;
        tmp.description = product.description;;
        tmp.imageView = product.imageView;;
        tmp.name = product.name;
        tmp.price = product.price;
        tmp.quantity = product.quantity;
        tmp.type = product.type;
        productItems.add(tmp);
    }
    public static List<Product> convertItemToList(List<ProductItem> product){
        List<Product> nList = new ArrayList<>();
        for(ProductItem p: product)
        {
            Product tmp = new Product();
            tmp.id = p.id;
            tmp.description = p.description;;
            tmp.imageView = p.imageView;;
            tmp.name = p.name;
            tmp.price = p.price;
            tmp.quantity = p.quantity;
            tmp.type = p.type;
            nList.add(tmp);
        }
        return  nList;


    }



    public static void addToCart(CartItem cartItem){
        cartItems.add(cartItem);
    }

    public static void removeItemCart(int pos){
        cartItems.remove(pos);
    }



    public Utils(Context context) {
        this.context = context;



    }

    public Utils() {

    }


    public ArrayList<Product> getMockData() {
        ArrayList<Product> tmp = new ArrayList<>();


        tmp.add(new Product("1"));
        tmp.add(new Product("2"));
        tmp.add(new Product("3"));
        tmp.add(new Product("4"));
        tmp.add(new Product("1"));
        tmp.add(new Product("2"));
        tmp.add(new Product("3"));
        tmp.add(new Product("4"));


        return tmp;
    }

    public ArrayList<Categories> getMockDataCategories() {
        ArrayList<Product> arrayListAo = new ArrayList<>();
        ArrayList<Product> arrayListQuan = new ArrayList<>();
        ArrayList<Product> arrayListVay = new ArrayList<>();
        ArrayList<Product> arrayListDam = new ArrayList<>();
        ArrayList<Categories> tmp = new ArrayList<>();

        tmp.add(new Categories("Áo", arrayListAo, "https://fashionminhthu.com.vn/wp-content/uploads/2021/06/ao-thun-in-hoa-tet-logo-tn-82887-1-450x630.jpg"));

        tmp.add(new Categories("Quần", arrayListQuan, "https://image.uniqlo.com/UQ/ST3/AsianCommon/imagesgoods/433110/item/goods_69_433110.jpg?width=1600&impolicy=quality_75"));

        tmp.add(new Categories("Váy", arrayListVay, "https://www.besanhdieu.com/images/stories/virtuemart/product/VAY056-1.jpg"));

        tmp.add(new Categories("Đầm", arrayListDam, "https://odessa.vn/Uploads/files/2022/%C4%90%E1%BA%A7m/DK21-026%20DEN%20(2)%20copy(1).jpg"));


        return tmp;
    }



    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
