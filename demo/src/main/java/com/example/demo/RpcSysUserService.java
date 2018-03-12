package com.example.demo;

import com.broker.service.ISysUserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author: Administrator
 * @description:
 * @date: Create in 2018/3/12 0012 下午 4:03
 * @modified:
 */
@FeignClient(value = "broker")
public interface RpcSysUserService extends ISysUserService {
}
