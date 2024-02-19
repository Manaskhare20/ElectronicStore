package com.electronic.store.ElectronicStore.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddItemToCartRequest {

    private  String productId;

    private  int quantity;

}
