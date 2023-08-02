def recoverSecret(triplets):
    chars = set(char for triplet in triplets for char in triplet)

    graph = {char: set() for char in chars}

    for triplet in triplets:
        graph[triplet[0]].add(triplet[1])
        graph[triplet[1]].add(triplet[2])

    def dfs(node, visited, result):
        if node not in visited:
            visited.add(node)
            for neighbor in graph[node]:
                dfs(neighbor, visited, result)
            result.append(node)

    visited = set()
    result = []
    for char in chars:
        dfs(char, visited, result)

    return ''.join(reversed(result))
        
