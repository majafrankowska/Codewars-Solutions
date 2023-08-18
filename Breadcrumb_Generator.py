def generate_bc(url, separator):
    if '//' in url:
        url = url[url.index('//') + 2:]
        
    url = url.rstrip('/')
    
    try:
        for i, c in enumerate(url):
            if c in ['?', '#']:
                url = url[0:i]
                break
                
        menus = url.split('/')[1:]
        if menus and 'index.' == menus [-1][0:6]:
            menus = menus [:-1]
        if not menus:
            return '<span class="active">HOME</span>'
        breadcrumb = '<a href="/">HOME</a>'
        for i, e in enumerate(menus [:-1]):
            breadcrumb += separator + '<a href="/{}/">{}</a>'.format('/'.join(menus [:i + 1]), get_element_name(e))
        breadcrumb += separator + '<span class="active">{}</span>'.format(get_element_name(menus[-1]))
        return breadcrumb
    except:
        return url
                                                                           
ignore_words = ["the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a"]
                                                                           
def get_element_name (element):
    acronyms = element.split('-')
    for i, c in enumerate(acronyms [-1]):
        if c == '.':
            acronyms [-1] = acronyms [-1][:i]
            break
                                                                           
    if len(element) > 30:
        for i, c in reversed(list(enumerate(acronyms))):
            if c in ignore_words: 
                acronyms.pop(i)                              
        return ''.join([s[0].upper() for s in acronyms])                                                                   
    return ' '.join([s.upper() for s in acronyms])                                                                  

from re import sub
                                                                           
ignoreList = ["THE", "OF", "IN", "FROM", "BY", "WITH", "AND", "OR", "FOR", "TO", "AT", "A"]
                                                                           
def generate_bc(url, separator):
    url = sub("https?://", "", url.strip("/"))
    url = sub("/index\..+$","", url)
    url = url.split ("/")
    url[-1] = sub("[\.#?].*", "", url[-1])
              
    menu = ["HOME"]
              
    for item in url[1:]:
        item = sub("-", " ", item.upper())
        if len(item) > 30:
            item = "".join([w[0] for w in item.split() if w not in ignoreList])
        menu.append(item)

    path = ["/"]
    for i in range(len(url) - 1):
        path.append(path[i] + url[i+1] + "/")

    html = []
    for i in range(len(url) - 1):
        html.append("<a href=\"" + path[i] + "\">" + menu[i] +"</a>")
    html.append("<span class=\"active\">" + menu[-1] +"</span>")
                
    return separator.join(html)
