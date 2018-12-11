package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication				//���󴴽�spring������
@MapperScan("cn.tedu.mapper")	//����Mapper�ӿ�ɨ�裬������ʵ����
public class RunAppSsm {
	public static void main(String[] args) {
		SpringApplication.run(RunAppSsm.class, args);
	}
}
