package org.springframework.cloud.netflix.zuul.web.socket;

/**
 * Strategy to resolve zuul properties
 *
 * @author Ronald Mthombeni
 * @author Salman Noor
 */
public interface ZuulPropertiesResolver {
	String getRouteHost();
}
