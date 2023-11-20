package com.codecool.happyshipping.controller;

import com.codecool.happyshipping.services.PackageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("packages")
public class Packages {

    private final PackageService packageService;

    public Packages(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public Collection<String> getPackages() {
        return this.packageService.getPackageNames();
    }
}
