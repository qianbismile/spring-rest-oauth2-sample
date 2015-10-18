package com.saintdan.framework.service;

import com.saintdan.framework.exception.RoleException;
import com.saintdan.framework.param.RoleParam;
import com.saintdan.framework.vo.RoleVO;
import com.saintdan.framework.vo.RolesVO;

/**
 * Group's Service.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
public interface GroupService {

    RoleVO create(RoleParam param) throws RoleException;

    RolesVO getAllGroups() throws RoleException;

    RoleVO getGroupById(RoleParam param) throws RoleException;

    RoleVO update(RoleParam param) throws RoleException;

    void delete(RoleParam param) throws RoleException;

}