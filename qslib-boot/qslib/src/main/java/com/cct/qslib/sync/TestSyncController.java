/*
 *
 *
 * @author caic
 * @since 1.0
 */
package com.cct.qslib.sync;

import com.cct.qslib.sync.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author caic
 * @Date 2024/2/23
 * @since 1.0
 */
@RequestMapping("/sync")
@RestController
public class TestSyncController {
    @Autowired
    private SyncService syncService;

    @RequestMapping("/test1")
    public void sync(){
//        syncService.createDict();
    }

    @RequestMapping("/cai")
    public void sync2(){
//        syncService.sync();
    }

    @RequestMapping("/type")
    public void sync3(){
        syncService.updateType();
    }

}
