package com.mft.cloud.zuul;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreZuulFilter extends ZuulFilter {

   @Override
   public boolean shouldFilter() {
      return true;
   }

   @Override
   public Object run() {
      RequestContext ctx = RequestContext.getCurrentContext();
      ctx.getRequest().getRequestURL();
      return null;
   }

   @Override
   public String filterType() {
      return "pre";
   }

   @Override
   public int filterOrder() {
      return 10;
   }

}
