package com.zpf.firstekserviceprovider;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 健康指示器
 * @author index
 *
 */
@Component
public class MyHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		if(HealthController.canVisitDb) {		
			// 成功连接数据库，返回UP
			return new Builder(Status.UP).build();
		} else {
			// 连接数据库失败，返回 out of service
			return new Builder(Status.DOWN).build();
		}
	}
}
