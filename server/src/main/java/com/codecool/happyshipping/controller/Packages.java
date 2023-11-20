package com.codecool.happyshipping.controller;

import com.codecool.happyshipping.model.Package;
import com.codecool.happyshipping.services.PackageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("packages")
public class Packages {

    private final PackageService packageService;

    public Packages(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public Collection<Package> getPackages() {
        return this.packageService.getPackageNames();
    }
}
