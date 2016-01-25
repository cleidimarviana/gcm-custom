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

## Screenshots

![alt tag](https://github.com/cleidimarviana/gcm-custom/blob/master/screenshots/screenshot.png "GCM Custom Layout")

Feedback
----
Questions, comments, and feedback are welcome at cleidimarviana@gmail.com

License
----

The MIT License (MIT)

Copyright (c) 2015 Cleidimar Viana 

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


**Free Software, Hell Yeah!**

  [1]: https://developers.google.com/cloud-messaging/android/client
  [2]: https://developers.google.com/cloud-messaging/#sample-register
