package com.xdja.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdja.admin.entity.Resource;
import com.xdja.admin.mapper.ResourceMapper;
import com.xdja.admin.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuwei
 * @since 2020-04-23
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
