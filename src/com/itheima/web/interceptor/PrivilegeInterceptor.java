package com.itheima.web.interceptor;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class PrivilegeInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		//�ж�session���Ƿ�����û�����
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		//�жϴ�session�л�ȡ���û���Ϣ�Ƿ�Ϊ��
		if(existUser == null) {
			//û�е�¼
			//������¼��Ϣ
			ActionSupport actionSupport = (ActionSupport) invocation.getAction();
			actionSupport.addActionError("û�е�¼��û��Ȩ�޷��ʣ�����");
			//�ص���¼ҳ
			return actionSupport.LOGIN;
		}else {
			//�Ѿ���¼
			return invocation.invoke();
		}
	}

}
