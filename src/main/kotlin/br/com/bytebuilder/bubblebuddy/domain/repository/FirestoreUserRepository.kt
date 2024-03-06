package br.com.bytebuilder.bubblebuddy.domain.repository


import br.com.bytebuilder.bubblebuddy.domain.dto.User
import com.google.api.core.ApiFutureCallback
import com.google.api.core.ApiFutures
import com.google.cloud.firestore.Firestore
import com.google.cloud.firestore.WriteResult
import com.google.common.util.concurrent.MoreExecutors
import com.google.firebase.cloud.FirestoreClient
import org.springframework.stereotype.Repository

@Repository
class FirestoreUserRepository : UserRepository {

    private val db: Firestore = FirestoreClient.getFirestore()
   public override fun createUser(user: User) {
        val docRef = db.collection("users").document(user.getIdUser())
        docRef.set(user).get() // Executa a operação de forma síncrona, bloqueia até completar
    }

    public  override fun getUserById(userId: String): User? {
        val docRef = db.collection("users").document(userId)
        val snapshot = docRef.get().get()
        return if (snapshot.exists()) snapshot.toObject(User::class.java) else null
    }
}