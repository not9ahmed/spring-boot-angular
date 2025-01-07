```toml
name = 'Update Blog'
method = 'PUT'
url = 'http://localhost:8080/blogs/2'
sortWeight = 3000000
id = 'f1efbcee-99da-4599-af84-55dd4da0fe55'

[body]
type = 'JSON'
raw = '''
{
  title: "Second blog title updated",
  content: "Second blog updated",
}'''
```
