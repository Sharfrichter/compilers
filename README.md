# ЯПИС

## Поживилко Петр

-  Формальная грамматика
 
Формальная грамматика или просто грамматика в теории формальных языков — способ описания формального языка, то есть выделения некоторого подмножества из множества всех слов некоторого конечного алфавита.

- Грамматика antlr

grammar T;//имя грамматики, должно совпадать с названием файла
//нетерминальные символы:
msg : 'name' ID ';' 
	{
		System.out.println("Hello, "+$ID.text+"!");
	} ;
  
//терминальные символы

ID: 'a'..'z' + ;//произвольное ( но >=1) количество букв

WS: (' ' |'\n' |'\r' )+ {$channel=HIDDEN;} ; // пробел, перенос строки, табуляция

- Абстрактное синтаксическое дерево и дерево разбора

Абстрактное в котором внутренние вершины сопоставлены (помечены) с операторами языка программирования, 
а листья — с соответствующими операндами. 
Таким образом, листья являются пустыми операторами и представляют только переменные и константы.

Дерево разбора разбивает на подвыражения а конечные вершины являются терминалами

- Синтаксис 

Синтаксис - Это правила составления предложений языка из отдельных предложений. Такие предложения - это операции, операторы, определения функций, переменные, разделы описания и т.к., в том числе и программа в целом.

- Семантика

Семантика - дисциплина, изучающая формализации значений конструкций языков программирования посредством построения их формальных математических моделей.

- Ошибки

Синтаксические ошибки – это ошибки в записи конструкций языка программирования (чисел, переменных, функций, выражений, операторов, меток, подпрограмм). 

Семантические ошибки – это ошибки, связанные с неправильным содержанием действий и использованием недопустимых значений величин.

- Интерпретация и компиляция

Главное отличие между компиляцией и интерпретацией заложено в принципе их работы. При компиляции загружается всё программное приложение, и оно проходит процедуру преобразования в машинные коды, понятные процессору. Программа интерпретации является исполняемым файлом, который последовательно считывает символику команд программного приложения и немедленно осуществляет исполнение, зашифрованных в них инструкций.
