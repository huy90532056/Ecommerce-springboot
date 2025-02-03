package com.devteria.identityservice.dto.response;

import com.devteria.identityservice.entity.ProductInventory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {

    private Long inventoryId;
    private String userId;
    private List<ProductInventory> productInventories;
}
