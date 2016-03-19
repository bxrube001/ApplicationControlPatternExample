/**
 * Created by brubert on 3/19/16.
 */
package org.techzoo.aqsa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {

    public View execute(HttpServletRequest request,
                        HttpServletResponse response) throws Exception;
}
