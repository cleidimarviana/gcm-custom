# GCM Custom

### Postman

TYPE POST - https://gcm-http.googleapis.com/gcm/send

HEADER
| n        | header           | Value  |
| ------------- |:-------------| :-----|
| 1  | Content-Type  | application/json  |
| 2  | Authorization  | key=AIzaSyZ-1u...0GBYzPu7U  |

BODY - RAW
```
  {
    "to": "em88cme09DIzaSyZ-1u...0GBYzPu7U",
    "data": {
      "message": "This is a GCM Topic Message!",
     }
  }
```

License
----

MIT

**Free Software, Hell Yeah!**

