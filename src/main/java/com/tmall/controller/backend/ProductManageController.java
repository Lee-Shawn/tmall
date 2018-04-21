package com.tmall.controller.backend;

import com.tmall.common.Const;
import com.tmall.common.ResponseCode;
import com.tmall.common.ServerResponse;
import com.tmall.pojo.Product;
import com.tmall.pojo.User;
import com.tmall.service.IProductService;
import com.tmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manage/product")
public class ProductManageController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProductService iProductService;

    /**
     * 新增或更新产品
     * @param session
     * @param product
     * @return
     */
    @RequestMapping("save.do")
    @ResponseBody
    public ServerResponse productSave(HttpSession session, Product product) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            return iProductService.saveOrUpdateProduct(product);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    /**
     * 修改产品销售状态
     * @param session
     * @param product
     * @return
     */
    @RequestMapping("set_sale_status.do")
    @ResponseBody
    public ServerResponse setSaleStatus(HttpSession session, Product product) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            return iProductService.setSaleStatus(product.getId(), product.getStatus());
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

}
