# Spring Boot OAuth2 Social Login with Google and Facebook Examples

## Control Flow

![alt text](https://i.stack.imgur.com/2YzJx.png)



# How to get Google Client ID and Client Secret?

Google sign-in allows your site visitors to login through Google in one click. Before you can integrate Google sign-in into your website, you need to create a Google client ID and Client Secret.

how to get Google Client ID and Client Secret in 10 simple and easy-to-follow steps.

Note: To generate Google Client ID and Client Secret you must be signed into a Google account.

1. Go to the Google Developers Console.

2. Click Select a project ➝ New Project ➝ the Create button.

___
![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-project.png)

3. Enter your Project name ➝ click the Create button.

__


![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-new-project.png)

4. Click OAuth consent screen in the left side menu ➝ choose User Type ➝ click the Create button.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-choose-user-type.png)

5. Add Application name ➝ Support email ➝ Authorized domain ➝ Developer content information ➝ click the Save and Continue button.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-oauth-consent-screen.png)

6. Complete all 4 steps in OAuth consent screen ➝ click the Back to Dashboard button.
__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-edit-app-registration.png)

7. Go to Credentials ➝ click Create Credentials ➝ select OAuth client ID from the dropdown list.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-creating.png)

8. Open the dropdown list Application type ➝ select Web application ➝ enter the name of your OAuth 2.0 client.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-select-application-type.png)

9. Enter your site URL in Authorized JavaScript origins ➝ in Authorized redirect URIs, enter the page URL where you wanted your users redirected back after they have authenticated with Google ➝ click the Create button.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/google-client-id-create-button.png)

10. Copy your Client ID and Client Secret.

__

![alt text](https://www.balbooa.com/images/knowledgebase/documentation-for-extensions/gridbox/copy-google-client-id-and-client-secret.png)


# How to get your Facebook app's APP ID and Secret Key ?

## Choose option according to you need

Follow the below steps to get your Facebook  APP ID and Secret Key :

Step 1 : Go to Facebook Developer page and click Log In
__

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8569b26c40.jpg)

Step 2 : If you have a Facebook account, log in, else create a new account. 

__

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85702643bb.jpg)

Step 3 : Once you have logged in, click My Apps in the top right corner of the page.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85711b588b.jpg)

Step 4 : Click the Create App button to create a new app.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85722c11df.jpg)

Step 5 : Select the Consumer option as the app type, then click Continue.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85734e5a31.jpg)

Step 6 : In the Create an App dialog, enter an app display name and app contact email. For the Business Manager account option, select No Business Manager account selected from the dropdown. Once done, click Create App.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8574c986fe.jpg)

Step 7 : Next, authenticate your account by entering your password and click Submit to continue.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//89155f9eea.jpg)

Step 8 : Open the Settings menu and click Basic.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8576659748.jpg)

Step 9 : Enter your App Domain, Privacy Policy URL, Term of Service URL, and Data deletion Callback URL in the respective fields.
Note: If you don’t have Data deletion Callback URL and Privacy Policy URL, copy and paste Appy Pie’s URL- https://appcdn.media/privacy/?app=APPNAME in both the fields.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85773210e7.jpg)

Step 10 : Scroll down the Basic Settings page, then open the Category dropdown menu and select Business and Pages. Once done, click Save Changes.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8578a38543.jpg)

Step 11 : Scroll down to the bottom of the Basic Settings page, then click the Add Platform button.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85793a4316.jpg)

Step 12 : Select Android and click Next.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8580376a19.jpg)

Step 13 : In the Select Android Store dialog, select Google Play from the dropdown menu.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8581cea4ae.jpg)

Step 14 : Once you have selected Google Play, click Next

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//85825fc1b1.jpg)

Step 15 :Under the Android section, enter Google Play Package Names, Class Name, and Key Hashes in the highlighted fields. If you don’t have these keys, copy-paste the following values:

Google Play Package Name - com.app.packagename
Note: packagename is unique for each app. To find your package name, refer to our tutorial: How to Find Your App Package Name?

Class Name - HomeActivity
Key Hashes - VaSOGhegZ8f7Iu+zY5VY6sD8MT8=

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//858300086b.jpg)

Step 16 : Once you have provided the required details, click Save Changes.


![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//858474742e.jpg)

Step 17 : Similarly, you can add the iOS platform. Click Add Platform at the bottom of the Basic settings page. 
Note: You can jump to Step 21 if you do not want to configure Facebook login for the iOS platform.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8585de6faa.jpg)

Step 18 : In the Select Platform dialog, select iOS and click Next.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8586d1c17c.jpg)

Step 19 : Under the iOS section, enter Bundle ID in the highlighted field. If you don’t have these keys, copy and paste the following values:
Bundle ID - com.app.packagename
Note: Packagename is unique for each app. To find your package name, refer to our tutorial: How to Find Your App Package Name?

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8587b3607e.jpg)


Step 20 : Once you have provided the required details, click Save Changes.

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//858806a106.jpg)

Step 21 : Now enable the Status toggle button at the top, and copy the App ID and App Secret

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8914e4e53c.jpg)

Step 22 : Now paste the copied App ID and Secret key in the highlighted field

![alt text](https://snappy.appypie.com/ckeditor/plugins/imageuploader/uploads/faqs//8913e36911.jpg)


# Social Login with OAuth2 in Spring Boot

This README provides an overview of the social login flow implemented using OAuth2 in a Spring Boot application. The code examples provided here demonstrate how users can authenticate using their Google or Facebook accounts and receive an authentication token for subsequent requests.

## Social Login Flow

### 1. **User Initiates Login:**
   - User clicks on a "Login with Google" button on the frontend.
   - Backend server handles the request and initiates the OAuth2 flow.

### 2. **OAuth2 Authorization Request:**
   - Backend server redirects the user to the OAuth2 authorization endpoint (Google/Facebook).
   - User is prompted to log in or grant permission.

### 3. **Redirect to Your Application:**
   - After permission is granted, the user is redirected back to your application with an authorization code.

### 4. **CustomOAuth2UserService:**
   - The custom user service processes the authorization code.
   - It exchanges the code for an access token from the OAuth2 provider's token endpoint.
   #### CustomOAuth2UserService Explanation

     Here's what the key parts of the `CustomOAuth2UserService` do:

##### `loadUser` Method:

- Overrides the `loadUser` method of `DefaultOAuth2UserService` to customize the loading of user information.
- Calls the `processOAuth2User` method to handle the processing of OAuth2 user information.

##### `processOAuth2User` Method:

- Receives the OAuth2 user information and the OAuth2 provider's request details.
- Checks if the user already exists in the database.
- If the user exists, updates their information. If not, registers a new user.
- Returns a `UserPrincipal` object containing the user's information and OAuth2 attributes.

##### `registerNewUser` Method:

- Creates a new `User` entity based on the OAuth2 user information.
- Sets the user's information, provider, provider ID, and active status.
- Saves the new user in the database using the `userRepository`.

##### `updateExistingUser` Method:

- Updates the existing user's provider information based on the OAuth2 provider's response.
- Sets the provider and provider ID, and optionally updates the first name.
- Saves the updated user information in the database using the `userRepository`.

In summary, the `CustomOAuth2UserService` is responsible for processing OAuth2 user information, checking if the user exists in the database, registering new users, updating existing users' provider information, and returning a `UserPrincipal` object containing user details and OAuth2 attributes. This service plays a crucial role in the authentication and user management process during OAuth2-based social login.



### 5. **OAuth2UserInfo and UserInfo Classes:**
   - User information is parsed using appropriate `OAuth2UserInfo` classes (e.g., `GoogleOAuth2UserInfo`).
   - User details like ID, name, email, etc., are retrieved from the OAuth2 provider's API.

### 6. **Process OAuth2 User Details:**
   - Custom user service processes the user details obtained from the `OAuth2UserInfo` class.
   - Checks if the user with the provided email exists in the database.
   - Updates existing user or creates a new user account.

### 7. **Authentication Success:**
   - OAuth2 authentication success handler determines the redirect URL.

### 8. **JWT Token Generation:**
   - The success handler generates a JWT token with user details and roles.

### 9. **Redirect with Token and User Info:**
   - User is redirected to the specified URL with the generated JWT token and user information.

### 10. **Frontend Processing:**
   - Frontend parses the JWT token to retrieve user information and roles.

### 11. **Token Usage:**
   - JWT token is included in request headers for authentication and authorization in subsequent API requests.

## Usage

1. Clone this repository.

2. Update `application.yml` with your OAuth2 client credentials.

3. Run the Spring Boot application.

4. Implement frontend components to handle the login buttons and process the JWT token.

## Dependencies

- Spring Boot
- OAuth2 Libraries
- JWT Utilities
