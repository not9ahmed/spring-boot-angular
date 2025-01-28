```toml
name = 'register'
method = 'POST'
url = 'http://localhost:8080/api/auth/register'
sortWeight = 1000000
id = '4d00cf98-b92a-4ce9-9497-1cfca4bd4e5b'

[body]
type = 'JSON'
raw = '''
{
  "username": "ADMIN",
  "password": "admin",
  "role": "ADMIN"
}'''
```
