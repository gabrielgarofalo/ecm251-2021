# Felipe Oliveira Boacnin RA:19.00616-0
# Gabriel Domingues Garofalo 19.01229-2
# Gabriel Moreira Silva 19.00397-8
# Leonardo Bezerra Celestino Zollner 19.02140-2

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
            break
        print(f"({estado}, '{c}') -> {dfa['delta'][(estado,c)]}")
        estado = dfa['delta'][(estado, f'{c}')]
        if (estado, f'{c}') not in dfa['delta'].keys():
            print(f'ERRO: Não foi possível realizar a transição do estado {estado} com entrada {c}')
            break
    if estado in dfa['final_states'] and l == []:
        aceitar = True
    if aceitar == True:
        print(f'A cadeia {entrada} foi aceita pelo autômato!')
    else:
        print(f'A cadeia {entrada} foi rejeitada pelo autômato!')

op = input("Bem-Vindo! Gostaria de testar uma cadeia? (s/n):").lower()
while op != 's' and op!= 'n':
    op = input("Digite uma opção válida! (s/n):").lower()
if op == 's':
    arq = input("Digite o nome do arquivo do autômato: ")
    with open(f'{arq}') as dfa_file:
        dfa_data = dfa_file.read()
    dfa = eval(dfa_data)
    while op != 'n':
        cadeia = input("Digite a cadeia: ")
        simular_dfa(dfa, cadeia)
        op = input("Gostaria de testar outa cadeia? (s/n):").lower()