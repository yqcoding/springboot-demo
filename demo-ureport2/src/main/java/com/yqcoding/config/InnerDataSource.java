package com.yqcoding.config;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 *@ClassName InnerDataSource
 *@Description 内部数据源配置
 *@Author yaoqiang
 *@Date 2023/2/9 15:14
 *@Version 1.0
 */
@Component
public class InnerDataSource implements BuildinDatasource {
    @Autowired
    private DataSource datasource;

    @Override
    public String name() {
        return "内部数据源";
    }

    @SneakyThrows
    @Override
    public Connection getConnection() {
        return datasource.getConnection();
    }

}
