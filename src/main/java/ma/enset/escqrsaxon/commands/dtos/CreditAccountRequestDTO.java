package ma.enset.escqrsaxon.commands.dtos;

public record CreditAccountRequestDTO(String accountId, double amount, String currency) {
}
