# Exercícios de AP1 de POO ULBRA, 2024/1-2T
Resolução de exercícios da disciplina de POO, na ULBRA.
O programa é executável pelo arquivo Main.java, que inicia exibição de terminal das opções, sendo cada uma delas os 7 exercícios exigidos. Escrevi toda a interface e variáveis em inglês para praticar o idioma. Criei a classe GeneralUtilities para criar o método de checagem de strings serem ou não numéricas (isNumeric). Não implementei questões dos exercícios com JFrame numa única janela, pois iria demorar demais para aprender como fazer isso e a atividade não exigia.

ATENÇÃO: O código também pode ser executado no Replit [neste link](https://replit.com/@GeovaniLopesLop/ULBRAPOOAP1exercicios#Main.java).

## Exercício 1:
Cumprida pela classe DiscountCalculation, atribuí propriedades para lidar com os inputs do usuário. Modularizei-a assim:
- calculateDiscount: retorna o valor de desconto segundo os atributos dum objeto da classe.
- inputValueAndPercentage: simula interface para inputs do usuário.
- exhibitDiscountData: simula interface para outputs ao usuário, chamando asmbas as classes anteriores.

## Exercício 2:
Cumprida pela classe ITBICalculation, atribuí propriedades para lidar com os inputs do usuário pela classe JFrame, como exigido. Modularizei como:
- calculateITBI: simula interface de inputs e instancia a classe com os mesmos.
- calculateTaxToPay: calcula imposto conforme regra imposta na atividade.
- exhibitITBICalculation: através dos métodos anteriores, simula a interface geral, com os outputs exigidos.

## Exercício 3:
Cumprida pela classe EvaluationSystem, atribuí propriedades para lidar com os inputs do usuário pela classe JFrame, como exigido. Modularizei-a da seguinte forma:
- enterProperGrade: solicita e checa inputs numéricos do usuário conforme valores de 0 a 10. Coloca usuário em looping para o caso de entradas inválidas.
- inputGrades: constrói um objeto da classe implementando o método acima.
- calculateAverageGrade: calcula a média simples das notas do usuário.
- exhibitEvaluationSystem: aplica os dois últimos métodos para simular a interface de resultados.

## Exercício 4:
Cumprida pela classe RetirementCalculation, usei a classe JRadioButton para determinar o sexo do respondente de modo mais rígido. Através dos atributos de idade, tempo de contribuição e do gênero booleano (para simplificar a análise), está modularizado por:
- enterProperAge: para input de idade inteira, colocando usuário em loop se idade não estiver no intervalo entre 0 e 100.
- enterProperContributionTime: idem anterior, sob intervalo de 1 a 50.
- GenderSelection: classe (gerada pelo ChatGPT) para construção de janela de seleção única para construir atributo booleano de sexo.
- inputData: instancia a classe RetirementCalculation conforme inputs do usuário pelas instâncias de JFrame.
- isRetirementViable: verifica a viabilidade de aposentadoria segundo regra de pontuação.
- exhibitRetirementCalculation: simula interface de outputs implementando métodos "inputData" e "isRetirementViable".

## Exercício 5:
Cumprida pela classe ParallelCircuit, atribuí propriedades para lidar com os inputs; implementei um cálculo para resistores em paralelo, mas não implementei no formulário a pergunta (para em série ou paralelo), pois não era exigido. A classe possui os atributos de ser ou não paralelo, a lista de resistores (instância da classe ArrayList de tipos float) e a resistẽncia equivalente (determinada no construtor pela passagem da lista). Os métodos:
- inputResistences: simula interface de input por looping, com a restrição imposta pela atividade.
- buildParalellCircuit: simula a interface de output.

## Exercício 6:
Cumprida pela classe LoginSystem, coloquei as chaves de acesso como atributos finais e estáticos; usei, além disso, apenas dois métodos simples para lidar com inputs e checagem, mas modularizei em dois métodos distintos:
- checkLogin: através dos inputs, retorna se eles estão (ou não) de acordo com os atributos "chave de acesso" pelo método equals.
- exhibitLogin: usa o método anterior dentro dum condicional num laço para simular a interface de três tentativas.


## Exercício 7:
Cumprida pela classe MultiplicationTable, modularizada simnplificadaemente em dois métodos:
- inputValue: simula interface de input do valor.
- exhibitTable: simula output da tabuada do valor.
