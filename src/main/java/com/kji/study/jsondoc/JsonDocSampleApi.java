package com.kji.study.jsondoc;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiAuthNone;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.annotation.ApiVersion;
import org.jsondoc.core.pojo.ApiVisibility;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(name = "docs sample", description = "descritiption sample", visibility = ApiVisibility.PUBLIC)
@ApiVersion(since = "1.0")
@ApiAuthNone
@RequestMapping("/docs")
@Controller
public class JsonDocSampleApi {

	@ApiMethod
	@RequestMapping("/sample")
	public @ApiResponseObject String getSampleDocs() {
		return "success";
	}
}
