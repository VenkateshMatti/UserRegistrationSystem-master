/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-10-17 15:04:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>User Signup</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        :root {\r\n");
      out.write("            --primary-color: #4a90e2;\r\n");
      out.write("            --secondary-color: #f5f5f5;\r\n");
      out.write("            --text-color: #333;\r\n");
      out.write("            --error-color: #e74c3c;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            background-color: var(--secondary-color);\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signup-container {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            color: var(--primary-color);\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        form {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            margin-bottom: 0.5rem;\r\n");
      out.write("            color: var(--text-color);\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"],\r\n");
      out.write("        input[type=\"email\"],\r\n");
      out.write("        input[type=\"password\"] {\r\n");
      out.write("            padding: 0.75rem;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            background-color: var(--primary-color);\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 0.75rem;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #357abd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .error-message {\r\n");
      out.write("            color: var(--error-color);\r\n");
      out.write("            font-size: 0.875rem;\r\n");
      out.write("            margin-top: 0.25rem;\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-link {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-link a {\r\n");
      out.write("            color: var(--primary-color);\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-link a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .error-message.visible {\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input.error {\r\n");
      out.write("            border-color: var(--error-color);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"signup-container\">\r\n");
      out.write("        <h2>Register</h2>\r\n");
      out.write("        <form id=\"registrationForm\" action=\"register\" method=\"post\" novalidate>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"name\">Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\" required>\r\n");
      out.write("                <div class=\"error-message\" id=\"nameError\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"email\">Email:</label>\r\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" required>\r\n");
      out.write("                <div class=\"error-message\" id=\"emailError\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"password\">Password:</label>\r\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required>\r\n");
      out.write("                <div class=\"error-message\" id=\"passwordError\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" value=\"Register\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"login-link\">\r\n");
      out.write("            Already have an account? <a href=\"signin.jsp\">Login here</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        document.getElementById('registrationForm').addEventListener('submit', function(event) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            \r\n");
      out.write("            // Reset previous error states\r\n");
      out.write("            resetErrors();\r\n");
      out.write("            \r\n");
      out.write("            let isValid = true;\r\n");
      out.write("            const name = document.getElementById('name').value.trim();\r\n");
      out.write("            const email = document.getElementById('email').value.trim();\r\n");
      out.write("            const password = document.getElementById('password').value;\r\n");
      out.write("\r\n");
      out.write("            // Name validation\r\n");
      out.write("            if (!name) {\r\n");
      out.write("                showError('name', 'Name is required');\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Email validation\r\n");
      out.write("            if (!email) {\r\n");
      out.write("                showError('email', 'Email is required');\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            } else if (!isValidEmail(email)) {\r\n");
      out.write("                showError('email', 'Please enter a valid email address');\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Password validation\r\n");
      out.write("            if (!password) {\r\n");
      out.write("                showError('password', 'Password is required');\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            } else if (password.length < 6) {\r\n");
      out.write("                showError('password', 'Password must be at least 6 characters long');\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if (isValid) {\r\n");
      out.write("                // Check if email already exists\r\n");
      out.write("                checkEmailExists(email).then(exists => {\r\n");
      out.write("                    if (!exists) {\r\n");
      out.write("                        this.submit();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        showError('email', 'This email is already registered');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function isValidEmail(email) {\r\n");
      out.write("            const emailRegex = /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/;\r\n");
      out.write("            return emailRegex.test(email);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showError(fieldId, message) {\r\n");
      out.write("            const field = document.getElementById(fieldId);\r\n");
      out.write("            const errorDiv = document.getElementById(fieldId + 'Error');\r\n");
      out.write("            field.classList.add('error');\r\n");
      out.write("            errorDiv.textContent = message;\r\n");
      out.write("            errorDiv.classList.add('visible');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function resetErrors() {\r\n");
      out.write("            const errorElements = document.getElementsByClassName('error-message');\r\n");
      out.write("            const inputElements = document.getElementsByTagName('input');\r\n");
      out.write("            \r\n");
      out.write("            for (let element of errorElements) {\r\n");
      out.write("                element.textContent = '';\r\n");
      out.write("                element.classList.remove('visible');\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            for (let element of inputElements) {\r\n");
      out.write("                element.classList.remove('error');\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Function to check if email exists (calls server endpoint)\r\n");
      out.write("        async function checkEmailExists(email) {\r\n");
      out.write("            try {\r\n");
      out.write("                const response = await fetch('checkEmail?email=' + encodeURIComponent(email));\r\n");
      out.write("                const data = await response.json();\r\n");
      out.write("                return data.exists;\r\n");
      out.write("            } catch (error) {\r\n");
      out.write("                console.error('Error checking email:', error);\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Prevent spaces in input fields\r\n");
      out.write("        const inputs = document.querySelectorAll('input[type=\"text\"], input[type=\"email\"], input[type=\"password\"]');\r\n");
      out.write("        inputs.forEach(input => {\r\n");
      out.write("            input.addEventListener('keypress', function(e) {\r\n");
      out.write("                if (e.key === ' ') {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
