package com.epam.edp.bar.conroller;

import com.epam.edp.bar.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class BarController {

    @Autowired
    private BarService barService;

    @GetMapping(value = "/api/setting")
    public String getSetting() {
        return barService.getSetting();
    }

}
