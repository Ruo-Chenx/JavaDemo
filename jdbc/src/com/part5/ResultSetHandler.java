package com.part5;

import java.sql.ResultSet;

/**
 * �����ǵ�ResultSetתΪT����
 * Resultset��������ݿⱣ�����ӣ����н��
 * @author Administrator
 *
 * @param <T>
 */
public interface ResultSetHandler<T> 
{
    public T handler(ResultSet rs);
}
