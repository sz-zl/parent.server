package test;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Demo01 {

	/**
	 * 代码生成器
	 */
	@Test
	public void testGenerator() {
		//1.全局配置
		GlobalConfig config = new GlobalConfig();
		//config.setActiveRecord(true);是否开启AR模式
		config.setAuthor("yk")//作者
		.setOutputDir("D:\\Java\\parent.server\\src\\main\\java")//生成路径
		.setFileOverride(true)//文件覆盖
		.setEnableCache(false)
		.setIdType(IdType.AUTO)//主键策略
		.setServiceName("%sService")//设置生成的service接口名字的首字母是否为I;例如:默认为IUsersService,设置后没有了I
		.setBaseResultMap(true)//生成SQL映射文件,方便自定义
		.setBaseColumnList(true);//生成SQL片段,基本的数据库中的列集合
		
		
		
		//2.数据源配置
		DataSourceConfig datasource = new DataSourceConfig();
		datasource.setDbType(DbType.ORACLE)//设置数据库类型
					.setDriverName("oracle.jdbc.driver.OracleDriver")
					.setUrl("jdbc:oracle:thin:@10.1.14.191:1521:orcl")
					.setUsername("lisi")
					.setPassword("abc");
		//3.策略配置
		StrategyConfig stConfig = new StrategyConfig();
		stConfig.setCapitalMode(true)//全局大写命令
				.setDbColumnUnderline(true)//指定表名,字段名是否使用下划线
				.setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
				.setTablePrefix("tb_")//表名下划线
				.setInclude("tb_manager");//生成的表
		//4.包名策略配置
		PackageConfig pkConfig = new PackageConfig();
		pkConfig.setParent("com.sz.p2p")//父包
				.setMapper("dao")
				.setService("service")
				.setServiceImpl("service.impl")
				.setController("controller")
				.setEntity("entity")
				.setXml("dao");
		//5.整合配置
		AutoGenerator ag = new AutoGenerator();
		ag.setGlobalConfig(config)
			.setDataSource(datasource)
			.setStrategy(stConfig)
			.setPackageInfo(pkConfig);
		
		//6.执行
		ag.execute();
	}
}
