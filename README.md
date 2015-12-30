# GCM Custom

### Postman

TYPE POST - https://gcm-http.googleapis.com/gcm/send

header     | value
-------- | ---
Content-Type | application/json
Authorization    | key=AIzaSyZ-1u...0GBYzPu7U 

BODY - RAW
```
  {
    "to": "em88cme09DIzaSyZ-1u...0GBYzPu7U",
    "data": {
      "message": "This is a GCM Topic Message!",
     }
  }
```
Support
----
 - [Set up a GCM Client App on Android][1]
 - [Engage your users across Android, iOS and Chrome][2]

License
----

MIT

**Free Software, Hell Yeah!**

  [1]: https://developers.google.com/cloud-messaging/android/client
  [2]: https://developers.google.com/cloud-messaging/#sample-register
