package com.thesaugat.androidclassjava.data;

import java.util.ArrayList;
import java.util.List;

public class DataSeeder {

    public static List<ProductData> getProductList() {
        List<ProductData> productDataList = new ArrayList<>();
        productDataList.add(new ProductData(1, "Jasmine", "http://sneakernews.com/wp-content/uploads/2021/08/Nike-Air-Force-1-Luxe-0.jpg", "", 3.7, 10000, 8000));
        productDataList.add(new ProductData(7, "Dulla Shoes", "http://sneakernews.com/wp-content/uploads/2021/08/Nike-Air-Force-1-Luxe-0.jpg", "", 3.7, 10000, 8000));
        productDataList.add(new ProductData(2, "Nike Air Force", "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_591,c_limit/9ff6d8fd-fdff-4626-9969-a38b09f42d7f/air-force-1-crater-mens-shoes-N0dK94.png", "", 3.7, 100000, 90000));
        productDataList.add(new ProductData(3, "Iphone 12 pro max", "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_591,c_limit/9ff6d8fd-fdff-4626-9969-a38b09f42d7f/air-force-1-crater-mens-shoes-N0dK94.png", "", 3.7, 40000, 20000));
        productDataList.add(new ProductData(4, "Mac Book Pro", "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_591,c_limit/9ff6d8fd-fdff-4626-9969-a38b09f42d7f/air-force-1-crater-mens-shoes-N0dK94.png", "", 3.7, 2500, 1900));
        productDataList.add(new ProductData(5, "Mi TV", "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_591,c_limit/9ff6d8fd-fdff-4626-9969-a38b09f42d7f/air-force-1-crater-mens-shoes-N0dK94.png", "", 3.7, 8000, 6000));
        productDataList.add(new ProductData(6, "Asus Gaming PC", "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_591,c_limit/9ff6d8fd-fdff-4626-9969-a38b09f42d7f/air-force-1-crater-mens-shoes-N0dK94.png", "", 3.7, 8000, 6000));

        return productDataList;

    }

}
