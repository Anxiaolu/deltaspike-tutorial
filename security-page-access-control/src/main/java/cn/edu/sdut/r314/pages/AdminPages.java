/*
 * Copyright 2016 subaochen.
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
 */
package cn.edu.sdut.r314.pages;

import cn.edu.sdut.r314.LoggedInAccessDecisionVoter;
import org.apache.deltaspike.core.api.config.view.ViewConfig;
import org.apache.deltaspike.jsf.api.config.view.Folder;
import org.apache.deltaspike.jsf.api.config.view.View;
import static org.apache.deltaspike.jsf.api.config.view.View.NavigationMode.REDIRECT;
import org.apache.deltaspike.security.api.authorization.Secured;

/**
 *
 * @author subaochen
 */
@View(navigation=REDIRECT)
@Folder(name="/admin")
@Secured(LoggedInAccessDecisionVoter.class)
public interface AdminPages extends ViewConfig{
    public class Index implements AdminPages {}
    
}
