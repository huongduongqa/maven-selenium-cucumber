package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",// vào đây tìm theo tag
		glue = "stepDefinitions",// đúng ra sẽ truyền path tuyệt đối nhưng chỉ cần truyền thư mục ngang hàng vs feature
		dryRun = true,//stop khi chỉ 1 step chưa define 
		monochrome = true, // make the report easier to read
		plugin = {"pretty","json:target/cucumber-report/cucumber.json"}
		//tags = {"@fea1,@fea3,@fea1"}
		)
		// plug in là gì, ví dụ cucable hoặc plugin của report
		//snippets = SnippetType.CAMELCASE,

public class TestRunner{

}