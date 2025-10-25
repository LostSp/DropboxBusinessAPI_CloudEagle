# Dropbox Business API Integration

This project demonstrates how to authenticate and fetch Dropbox Business Team Information using Java.

## Steps Implemented
1. Created Dropbox Business Developer App with OAuth2.
2. Configured Postman and obtained Access Token.
3. Tested `/team/get_info` API in Postman.
4. Implemented the same endpoint using Java (`HttpURLConnection`).
5. Successfully fetched team information with 200 OK response.

## API Used
`POST https://api.dropboxapi.com/2/team/get_info`

## Example Output
{"name": "Humeranishat52", "team_id": "dbtid:AAABAE08fhUDnIIb1KJE_4nsYKbFtqSkpRM", "num_licensed_users": 5,......}
