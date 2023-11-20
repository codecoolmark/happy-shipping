package com.codecool.happyshipping.services;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PackageService {
    public Collection<String> getPackageNames() {
        return List.of("first package", "second package");
    }
}
