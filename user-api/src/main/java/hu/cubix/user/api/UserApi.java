package hu.cubix.user.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user", url = "${feign.user.url}")
public interface UserApi {


}
