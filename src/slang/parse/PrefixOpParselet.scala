package slang.parse

import slang.lex.Token

class PrefixOpParselet extends PrefixParselet {
    override def parse(parser: Parser, token: Token): Expr = {
        val operand = parser.expression(Precedence.CALL)
        Expr.Prefix(token, operand)
    }
}
