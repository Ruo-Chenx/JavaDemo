package com.part5;

import java.sql.ResultSet;

/**
 * 把我们的ResultSet转为T对象
 * Resultset必须和数据库保持连接，才有结果
 * @author Administrator
 *
 * @param <T>
 */
public interface ResultSetHandler<T> 
{
    public T handler(ResultSet rs);
}
