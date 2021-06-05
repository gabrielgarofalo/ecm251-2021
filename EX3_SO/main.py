# Felipe Oliveira Boacnin RA:19.00616-0
# Gabriel Domingues Garofalo 19.01229-2
# Gabriel Moreira Silva 19.00397-8
# Leonardo Bezerra Celestino Zollner 19.02140-2
with open('m.dfa.txt') as dfa_file:
    dfa_data = dfa_file.read()

dfa = eval(dfa_data)
# Para conferir o conteúdo
#print(dfa)
#print(dfa['states'])
#print(dfa['initial_state'])
#print(dfa['sigma'])
#print(dfa['delta'])
#print(dfa['final_states'])


def simular_dfa(dfa,entrada):
    estado = dfa['initial_state']
    aceitar = False
    l = list(entrada)
    while len(l) > 0:
        c = l.pop(0)
        if c not in dfa['sigma']:
            print(f'ERRO: O símbolo {c} não pertence ao alfabeto do autômato!')
            l.insert(0, c)
            break
        if estado not in dfa['states']:
            print(f'ERRO: O estado {estado} não pertence ao conjunto de estados do autômato!')
            estado = dfa['delta'][(estado, f'{c}')]
            break
        if estado not in dfa['delta'].keys(): # ver em delta.keys() se [e possivel fazer uma transicao
            print(f'ERRO: Não foi possível realizar a transição do estado {estado} com entrada {c}')
            break
    if estado in dfa['final_states'] and l == []:
        aceitar = True
    if aceitar == True:
        print(f'A cadeia {entrada} foi aceita pelo autômato!')
    else:
        print(f'A cadeia {entrada} foi rejeitada pelo autômato!')

simular_dfa(dfa, '1110')