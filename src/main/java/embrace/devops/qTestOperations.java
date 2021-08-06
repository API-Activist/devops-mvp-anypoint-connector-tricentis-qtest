package embrace.devops;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class qTestOperations {

	private static final Logger LOGGER = LoggerFactory.getLogger(qTestOperations.class);
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-information")
	public String getProjects(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjects entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId;
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	


	@MediaType(value = ANY, strict = false)
	@Alias("Get-all-projects")
	public String getAllProjects(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getAllProjects entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String token = qtToken.getToken();
		
		LOGGER.info("Token: " + token);  	
    	String url = url_in + "/api/v3/projects";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	
	

	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-releases")
	public String getProjectReleases(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectReleases entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/releases";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-requirements")
	public String getProjectRequirements(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectRequirements entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/requirements";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-fields-for-defects")
	public String getFieldsDefects(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getFieldsDefects entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/settings/defects/fields";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	

	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-fields-for-tests")
	public String getFieldsTests(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getFieldsTests entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/settings/test-cases/fields";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	
	
	
	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-test-cases")
	public String getProjectTestcases(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectTestcases entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/test-cases";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}		
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-defects")
	public String getProjectDefects(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectDefects entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/defects";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}		

	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-builds")
	public String getProjectBuilds(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectBuilds entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/builds";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}		

	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-test-runs")
	public String getProjectTestRuns(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectTestRuns entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/test-runs";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-project-test-cycles")
	public String getProjectTestcycles(@Config qTestConfiguration GLConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken) throws IOException, InterruptedException {
    	LOGGER.info("getProjectTestcycles entered");  		

		String responseBody;
		String url_in = GLConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/test-cases";
		
		responseBody = getRequest(url, token);

		return responseBody;
		
		
	}		
	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Add-a-test-case")
	public String AddTestCase(@Config qTestConfiguration qtConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken, @ParameterGroup(name="Payload") qtParameterPayload qtPayload) throws IOException, InterruptedException {
    	LOGGER.info("AddTestCase entered");  		

		String responseBody;
		String url_in = qtConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/test-cases";
		String payload = qtPayload.getPayload();
		
		
		responseBody = sendRequest(url, token, payload);

		return responseBody;
		
		
	}	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Add-a-defect")
	public String AddDefect(@Config qTestConfiguration qtConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken, @ParameterGroup(name="Payload") qtParameterPayload qtPayload) throws IOException, InterruptedException {
    	LOGGER.info("AddDefect entered");  		

		String responseBody;
		String url_in = qtConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/defects";
		String payload = qtPayload.getPayload();
		
		
		responseBody = sendRequest(url, token, payload);

		return responseBody;
		
		
	}	

	
	@MediaType(value = ANY, strict = false)
	@Alias("Update-defect")
	public String UpdateDefect(@Config qTestConfiguration qtConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken, @ParameterGroup(name="Id") qtParameterId qtId, @ParameterGroup(name="Payload") qtParameterPayload qtPayload) throws IOException, InterruptedException {
    	LOGGER.info("UpdateDefect entered");  		

		String responseBody;
		String url_in = qtConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/defects/" + qtId.getId();
		String payload = qtPayload.getPayload();
		
		
		responseBody = sendRequest(url, token, payload);

		return responseBody;
		
		
	}	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Update-test-case")
	public String UpdateTest(@Config qTestConfiguration qtConfig, @ParameterGroup(name="Project") qtParameterProject qtProject, @ParameterGroup(name="Token") qtParameterToken qtToken, @ParameterGroup(name="Id") qtParameterId qtId, @ParameterGroup(name="Payload") qtParameterPayload qtPayload) throws IOException, InterruptedException {
    	LOGGER.info("UpdateTest entered");  		

		String responseBody;
		String url_in = qtConfig.getUrl();
		String projectId = qtProject.getProjectId();
		String token = qtToken.getToken();
    	String url = url_in + "/api/v3/projects/" + projectId + "/test-cases/" + qtId.getId();
		String payload = qtPayload.getPayload();
		
		
		responseBody = sendRequest(url, token, payload);

		return responseBody;
		
		
	}	
	@MediaType(value = ANY, strict = false)
	@Alias("Login-to-qTest")
	public String Login(@Config qTestConfiguration qtConfig) throws IOException, InterruptedException {
    	LOGGER.info("qTest Login entered");  		

		String responseBody;
		String url_in = qtConfig.getUrl();
		String username = qtConfig.getUsername();
		String password = qtConfig.getPassword();
		String payload = "grant_type=password&username=" + username + "&password=" + password;
    	String url = url_in + "/oauth/token";
		
		responseBody = sendLoginRequest(qtConfig, url, payload);

		return responseBody;
		
		
	}	
	
	private String getRequest(String qtURL, String token) throws IOException, InterruptedException {

		StringBuilder responseBodyReturn;
		int responseCode = 0;
		
		String pat = token;

		
    	URL url = new URL(qtURL);
    	LOGGER.info("qTest Request-url: " + url);  		
    	
    	URLConnection conn = url.openConnection();

    	if(conn instanceof HttpsURLConnection){
			LOGGER.info("Processing HTTPS request");
			HttpsURLConnection https = (HttpsURLConnection) conn;
	    	https.setRequestMethod("GET");
	    	https.addRequestProperty("Accept", "*/*");
	    	
	    	String basicAuth = "Bearer " + pat;

	    	https.setRequestProperty ("Authorization", basicAuth);
	    	
        	responseCode = https.getResponseCode();
            InputStream inputStream;
            if (200 <= responseCode && responseCode <= 299) {
                inputStream = https.getInputStream();
            } else {
                inputStream = https.getErrorStream();
            }

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    inputStream));

            StringBuilder responseBody = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null) 
            	responseBody.append(currentLine);

            in.close();
            
            responseBodyReturn = responseBody;

    	} 
    	else {
    		LOGGER.info("Processing HTTP request");
        	HttpURLConnection http = (HttpURLConnection) conn;
        	http.setRequestMethod("GET");
        	http.addRequestProperty("Accept", "*/*");
        	
	    	String basicAuth = "Bearer " + pat;

	    	http.setRequestProperty ("Authorization", basicAuth);
	    	
        	responseCode = http.getResponseCode();
            InputStream inputStream;
            if (200 <= responseCode && responseCode <= 299) {
                inputStream = http.getInputStream();
            } else {
                inputStream = http.getErrorStream();
            }

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    inputStream));

            StringBuilder responseBody = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null) 
            	responseBody.append(currentLine);

            in.close();

            responseBodyReturn = responseBody;
    	}

    	

    	
    	LOGGER.info("qTest ReturnCode: " + String.valueOf(responseCode));
    	

		return responseBodyReturn.toString();
		
		
	}	

	private String sendRequest(String qtURL, String token, String qtPayload) throws IOException, InterruptedException {

		StringBuilder responseBodyReturn;
		int responseCode = 0;
		
		String pat = token;

		
    	URL url = new URL(qtURL);
    	LOGGER.info("qTest Request-url: " + url);  		
    	
    	URLConnection conn = url.openConnection();

    	try {

	    	if(conn instanceof HttpsURLConnection){
				LOGGER.info("Processing HTTPS request");
				HttpsURLConnection https = (HttpsURLConnection) conn;

				
	        	https.setDoOutput(true);
		    	https.setDoInput(true);				
				https.setRequestMethod("POST");
				https.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				https.setRequestProperty("Accept", "application/json");    	
		    	String basicAuth = "Bearer " + pat;
	
		    	https.setRequestProperty ("Authorization", basicAuth);
		    	
		    	
	        	try(OutputStream os = conn.getOutputStream()){
					byte[] input = qtPayload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendGETRequest: " + https.getResponseCode());
	
	    	} 
	    	else {
	    		LOGGER.info("Processing HTTP request");
	        	HttpURLConnection http = (HttpURLConnection) conn;

	        	http.setDoOutput(true);
	        	http.setDoInput(true);
		    	http.setRequestMethod("POST");
		    	http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		    	http.setRequestProperty("Accept", "application/json");    	

	        	
		    	String basicAuth = "Bearer " + pat;
	
		    	http.setRequestProperty ("Authorization", basicAuth);
		    	
	        	
		    	try(OutputStream os = conn.getOutputStream()){
					byte[] input = qtPayload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendRequest: " + http.getResponseCode());
	    	}
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = br.readLine()) != null) {
	            sb.append(line+"\n");
	        }
	        br.close();

	        responseBodyReturn = sb;

	    	
		} catch(IOException e) {
	    	LOGGER.error("Error occurred while POSTing resource: " + url);
	    	e.printStackTrace();
	    	responseBodyReturn = null;
		}    	

		return responseBodyReturn.toString();
		
		
	}	


	
	private String sendUpdateRequest(String qtURL, String token, String qtPayload) throws IOException, InterruptedException {

		StringBuilder responseBodyReturn;
		int responseCode = 0;
		
		String pat = token;

		
    	URL url = new URL(qtURL);
    	LOGGER.info("qTest Request-url: " + url);  		
    	
    	URLConnection conn = url.openConnection();

    	try {

	    	if(conn instanceof HttpsURLConnection){
				LOGGER.info("Processing HTTPS request");
				HttpsURLConnection https = (HttpsURLConnection) conn;

				
	        	https.setDoOutput(true);
		    	https.setDoInput(true);				
				https.setRequestMethod("PUT");
				https.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				https.setRequestProperty("Accept", "application/json");    	
		    	String basicAuth = "Bearer " + pat;
	
		    	https.setRequestProperty ("Authorization", basicAuth);
		    	
		    	
	        	try(OutputStream os = conn.getOutputStream()){
					byte[] input = qtPayload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendGETRequest: " + https.getResponseCode());
	
	    	} 
	    	else {
	    		LOGGER.info("Processing HTTP request");
	        	HttpURLConnection http = (HttpURLConnection) conn;

	        	http.setDoOutput(true);
	        	http.setDoInput(true);
		    	http.setRequestMethod("PUT");
		    	http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		    	http.setRequestProperty("Accept", "application/json");    	

	        	
		    	String basicAuth = "Bearer " + pat;
	
		    	http.setRequestProperty ("Authorization", basicAuth);
		    	
	        	
		    	try(OutputStream os = conn.getOutputStream()){
					byte[] input = qtPayload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendRequest: " + http.getResponseCode());
	    	}
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = br.readLine()) != null) {
	            sb.append(line+"\n");
	        }
	        br.close();

	        responseBodyReturn = sb;

	    	
		} catch(IOException e) {
	    	LOGGER.error("Error occurred while POSTing resource: " + url);
	    	e.printStackTrace();
	    	responseBodyReturn = null;
		}    	

		return responseBodyReturn.toString();
		
		
	}	

	
	
	private String sendLoginRequest(@Config qTestConfiguration qtConfig, String qtURL, String qtPayload) throws IOException, InterruptedException {

		StringBuilder responseBodyReturn;
		int responseCode = 0;
		
		String pat = qtConfig.getUsername();
    	String payload = qtPayload;    	
		
    	URL url = new URL(qtURL);
    	LOGGER.info("qTest Request-url: " + url);  		
    	
    	URLConnection conn = url.openConnection();

    	try {
			
	    	if(conn instanceof HttpsURLConnection){
				LOGGER.info("Processing HTTPS request");
		    	HttpsURLConnection https = (HttpsURLConnection) conn;
	        	String userCredentials =  pat + ":";
	        	String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));

	        	https.setDoOutput(true);
		    	https.setDoInput(true);
		    	https.setRequestMethod("POST");
		    	https.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		    	https.setRequestProperty("Accept", "*/*");    	

	        	https.setRequestProperty ("Authorization", basicAuth);
	        	try(OutputStream os = conn.getOutputStream()){
					byte[] input = payload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendGETRequest: " + https.getResponseCode());
	    	}
	    	else {
				LOGGER.info("Processing HTTP request");
		    	HttpURLConnection http = (HttpURLConnection) conn;
	        	String userCredentials = ":" + pat;
	        	String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));

		    	http.setDoOutput(true);
		    	http.setDoInput(true);
		    	http.setRequestMethod("POST");
		    	http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		    	http.setRequestProperty("Accept", "*/*");    	

	        	http.setRequestProperty ("Authorization", basicAuth);
		    	try(OutputStream os = conn.getOutputStream()){
					byte[] input = payload.getBytes("utf-8");
					os.write(input,0,input.length);
				}
				
		    	LOGGER.info("Response Code sendRequest: " + http.getResponseCode());

	    	}
	    	
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = br.readLine()) != null) {
	            sb.append(line+"\n");
	        }
	        br.close();

	        responseBodyReturn = sb;

	    	
		} catch(IOException e) {
	    	LOGGER.error("Error occurred while POSTing resource: " + url);
	    	e.printStackTrace();
	    	responseBodyReturn = null;
		}
		
		
	
		return responseBodyReturn.toString();
		
		
	}	


}
