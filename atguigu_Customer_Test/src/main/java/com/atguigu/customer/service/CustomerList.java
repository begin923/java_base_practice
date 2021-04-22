package com.atguigu.customer.service;

import com.atguigu.customer.bean.Customer;

/**
 * 对象管理模块
 * 内部用数组管理一组Customer 对象，并提供相应的增删改查方法工 Customer 调用
 */
public class CustomerList {
    private Customer[] customers; // 用来保存客户对象的数组
    private int total; // 记录一保存客户对象的数量

    /**
     * 初始化数组的构造器
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length)
            return false;

        // total 添加完客户后，要使 total 增加 1 ，因为total 是从 1 开始的
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true :修改成功，flase : 修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if(index < 0 || index >= total){
            return false;
        }

        customers[index] = cust;
        return true;
    }

    /**
     * 删除用户信息
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        if(index < 0 || index >= total){
            return false;
        }

        for(int i = index ; i < total - 1 ; i++){
            customers[i] = customers[i+1];
        }

        customers[--total] = null;

        return true;
    }

    /**
     * 获取所有客户信息,去除空值
     * @return
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0 ; i < total ; i++ ){
            custs[i] = customers[i];
        }
        return custs ;
    }

    /**
     * 获取客户总数
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * 获取单个客户信息
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total )
            return null;
        return customers[index];
    }
}


