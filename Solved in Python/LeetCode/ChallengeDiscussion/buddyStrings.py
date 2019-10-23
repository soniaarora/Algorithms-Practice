class buddy(object):
    def buddyStrings(self,A, B):
        if len(A) != len(B) or set(A) != set(B):
            return False
        if A == B:
            return len(set(A)) < len(A)

        else:
            i = 0
            counter = 0
            indices = []
            while i < len(A):
                if A[i] != B[i]:
                    indices.append(i)
                    counter += 1
                if counter > 2:
                    return False
                i += 1
            
            return A[indices[0]] == B[indices[1]] and A[indices[1]] == B[indices[0]]


b = buddy()
print(b.buddyStrings('ab', 'ba'))