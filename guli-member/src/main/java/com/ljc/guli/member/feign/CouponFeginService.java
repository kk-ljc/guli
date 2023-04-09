package com.ljc.guli.member.feign;

import com.ljc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("guli-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
