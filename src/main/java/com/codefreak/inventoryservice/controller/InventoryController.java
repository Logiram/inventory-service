package com.codefreak.inventoryservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codefreak.inventoryservice.dto.InventoryResponse;
import com.codefreak.inventoryservice.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	private final InventoryService inventoryService;
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isinStock(skuCode);
    
        
	}

}