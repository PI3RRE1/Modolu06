using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace Airlaineapi.Models
{
    public class Reserva
    {
        [Key]
        public int Id { get; set; }
        public string Num_Pessoas { get; set; }
        public string NumeroAssento { get; set; }
        public string Destino { get; set; }
        public string Origem { get; set; }
        public string CompanhiaAerea { get; set; }
        public string Aeroporto { get; set; }
        public string Preco { get; set; }
        public DateTime DataReserva { get; set; }
        [JsonIgnore]
        public Usuario Usuario { get; set;}
        public int UsuarioId { get; set; }



    }
}
