/*
 * Copyright 2013-2017 Erudika. https://erudika.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For issues and patches go to: https://github.com/erudika
 */
package com.erudika.scoold.pages.click;

import com.erudika.scoold.pages.Base;

/**
 *
 * @author Alex Bogdanovski [alex@erudika.com]
 */
public class NotFound extends Base {

	public String title;

	public NotFound() {
        title = lang.get("notfound.title");

		addModel("APPNAME", Base.APPNAME);
		addModel("DESCRIPTION", Base.DESCRIPTION);
		addModel("KEYWORDS", Base.KEYWORDS);
		addModel("CDN_URL", Base.CDN_URL);
		addModel("IN_PRODUCTION", Base.IN_PRODUCTION);
	}

	public String getTemplate() {
		return "click/not-found.htm";
	}
}